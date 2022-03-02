package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.stats.GmsCoreStatsChimeraService;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jdd {
    protected static final List a(Context context, FilenameFilter filenameFilter, String str) {
        Context d = aekv.d(context);
        File dir = d.getDir("stats", 0);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = dir.listFiles(filenameFilter);
        if (listFiles != null) {
            Collections.addAll(arrayList, listFiles);
        } else {
            String path = dir.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 52);
            sb.append("Expected ");
            sb.append(path);
            sb.append(" to be a readable directory, but it is not.");
            Log.e("StatsUploadTask", sb.toString());
        }
        File file = new File(d.getFilesDir(), str);
        if (file.exists()) {
            arrayList.add(file);
        }
        return arrayList;
    }

    public abstract String a();

    public abstract List a(Context context);

    public abstract boolean a(aucd aucd);

    public abstract boolean b();

    public abstract long c();

    public abstract int d();

    public void a(Application application) {
        iwu iwu;
        if (b()) {
            int d = d();
            if (d == 21) {
                iwu = iwv.a((Context) ihs.b(), true);
            } else {
                iwu = iwv.a((Context) ihs.b(), ((Boolean) jcg.h.c()).booleanValue());
            }
            if (!iwu.b()) {
                GmsCoreStatsChimeraService.a((Context) application);
                return;
            }
            ihs b = ihs.b();
            Context d2 = aekv.d(b);
            List a = iwu.a(b);
            String valueOf = String.valueOf(a());
            Log.i("StatsUploadTask", valueOf.length() == 0 ? new String("Uploading ") : "Uploading ".concat(valueOf));
            try {
                iao.a();
                aohg a2 = iao.a(d2);
                int i = d - 1;
                if (d != 0) {
                    if (!(i == 2 || i == 3)) {
                        if (i == 4) {
                            if (jkr.c() && ((Boolean) jcd.g.c()).booleanValue()) {
                                SharedPreferences.Editor edit = d2.getSharedPreferences("NetworkReportServicePrefs", 0).edit();
                                long longValue = ((Long) jcd.d.c()).longValue() + jed.c(System.currentTimeMillis()).longValue();
                                jdx.a();
                                long longValue2 = ((Long) jcd.e.c()).longValue() + longValue;
                                jdx.a(b, Process.myUid(), longValue, longValue2);
                                edit.putLong("lastDailyReportTaskEndTimestamp", longValue2);
                                if (!edit.commit()) {
                                    Log.e("StatsUploadTask", "failed to write the last timestamp to sharedPreferences");
                                }
                            }
                            new jdk(d2, d).a(this, a, a2);
                        } else if (i != 5) {
                            if (i == 18) {
                                new jdk(d2, d).a(this, a, a2);
                            } else if (i == 20) {
                                List a3 = a(d2);
                                a(a3);
                                new jdk(d2, d, a3).a(this, a, a2);
                            } else if (d != 0) {
                                StringBuilder sb = new StringBuilder(25);
                                sb.append("Invalid event ");
                                sb.append(i);
                                throw new jdj(sb.toString());
                            } else {
                                throw null;
                            }
                        }
                        String a4 = a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a4).length() + 20);
                        sb2.append("Uploading ");
                        sb2.append(a4);
                        sb2.append(" completed");
                        Log.i("StatsUploadTask", sb2.toString());
                        return;
                    }
                    List<File> a5 = a(d2);
                    a((List) a5);
                    for (File a6 : a5) {
                        jdk.a(d2, d, a6).a(this, a, a2);
                    }
                    String a42 = a();
                    StringBuilder sb22 = new StringBuilder(String.valueOf(a42).length() + 20);
                    sb22.append("Uploading ");
                    sb22.append(a42);
                    sb22.append(" completed");
                    Log.i("StatsUploadTask", sb22.toString());
                    return;
                }
                throw null;
            } catch (jdj e) {
                String valueOf2 = String.valueOf(e.toString());
                Log.e("StatsUploadTask", valueOf2.length() == 0 ? new String("Failed to upload logs. ") : "Failed to upload logs. ".concat(valueOf2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        UserManager userManager;
        if (jkr.c() && (userManager = (UserManager) ihs.b().getSystemService("user")) != null && userManager.isUserUnlocked()) {
            list.addAll(a((Context) ihs.b()));
        }
    }
}
