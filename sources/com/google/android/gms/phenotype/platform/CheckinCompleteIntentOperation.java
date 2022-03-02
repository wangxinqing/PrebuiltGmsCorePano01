package com.google.android.gms.phenotype.platform;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckinCompleteIntentOperation extends IntentOperation {
    static final String[] a = {"DUMMYLOGSOURCE"};
    private static final jjg b = jjg.a(iyc.PHENOTYPE);
    private static final int[] c = new int[0];
    private Context d;
    private yey e;
    private hph f;
    private hph g;

    private final int[] a() {
        int i = 0;
        Map a2 = aeeg.a(this.d.getContentResolver(), "checkin_expid_");
        if (a2.isEmpty()) {
            return c;
        }
        int[] iArr = new int[a2.size()];
        for (Map.Entry entry : a2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null && !str2.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(str.substring(14));
                    iArr[i] = parseInt;
                    i++;
                    try {
                        this.f.d("CheckinExpId").a(parseInt);
                        this.g.d("CheckinExpIdFlushed").a(parseInt);
                    } catch (NumberFormatException e2) {
                    }
                } catch (NumberFormatException e3) {
                    this.f.c("BadCheckinExpId").a();
                    this.g.c("BadCheckinExpIdFlushed").a();
                    ((anih) ((anih) b.c()).a("com.google.android.gms.phenotype.platform.CheckinCompleteIntentOperation", "a", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received gservices flag with bad format: %s", (Object) str);
                }
            }
        }
        return i != a2.size() ? Arrays.copyOf(iArr, i) : iArr;
    }

    public final void onCreate() {
        yey a2 = yef.a((Context) this);
        hph hph = new hph(yfd.a(), "PHENOTYPE_COUNTERS", 1024);
        hph hph2 = new hph(yfd.a(), "PHENOTYPE_COUNTERS", 1024);
        this.d = this;
        this.e = a2;
        this.f = hph;
        this.g = hph2;
    }

    public final void onDestroy() {
        this.f.d();
    }

    public final void onHandleIntent(Intent intent) {
        int[] iArr;
        if (intent != null) {
            String action = intent.getAction();
            if (!"com.google.android.checkin.CHECKIN_COMPLETE".equals(action)) {
                ((anih) ((anih) b.c()).a("com.google.android.gms.phenotype.platform.CheckinCompleteIntentOperation", "onHandleIntent", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received unknown action: %s", (Object) action);
            } else if (intent.getBooleanExtra("success", true)) {
                int i = 0;
                Map a2 = aeeg.a(this.d.getContentResolver(), "checkin_expid_");
                if (!a2.isEmpty()) {
                    iArr = new int[a2.size()];
                    for (Map.Entry entry : a2.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str2 != null && !str2.isEmpty()) {
                            try {
                                int parseInt = Integer.parseInt(str.substring(14));
                                iArr[i] = parseInt;
                                i++;
                                try {
                                    this.f.d("CheckinExpId").a(parseInt);
                                    this.g.d("CheckinExpIdFlushed").a(parseInt);
                                } catch (NumberFormatException e2) {
                                }
                            } catch (NumberFormatException e3) {
                                this.f.c("BadCheckinExpId").a();
                                this.g.c("BadCheckinExpIdFlushed").a();
                                ((anih) ((anih) b.c()).a("com.google.android.gms.phenotype.platform.CheckinCompleteIntentOperation", "a", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received gservices flag with bad format: %s", (Object) str);
                            }
                        }
                    }
                    if (i != a2.size()) {
                        iArr = Arrays.copyOf(iArr, i);
                    }
                } else {
                    iArr = c;
                }
                Arrays.toString(iArr);
                try {
                    acws.a(this.e.a("com.google.android.gms.checkin.binary", 1, a, iArr), ayzv.f(), TimeUnit.MILLISECONDS);
                    this.f.c("CheckinExpIdWeakRegisterSuccess").a();
                    this.g.c("CheckinExpIdWeakRegisterSuccessFlushed").a();
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    this.f.c("CheckinExpIdWeakRegisterFailure").a();
                    this.g.c("CheckinExpIdWeakRegisterFailureFlushed").a();
                }
                if (azaf.a.a().s()) {
                    yij.a((Context) this, 19, (String) null);
                }
                this.g.d().a(1, TimeUnit.SECONDS);
            }
        }
    }
}
