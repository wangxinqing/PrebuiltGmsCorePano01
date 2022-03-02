package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.util.concurrent.Executor;

/* renamed from: apmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmj extends aplf {
    static final String[] a = {"com.google.android.googlequicksearchbox", "com.google.android.gms"};
    final apmi b;
    private final Context c;

    public apmj(Context context) {
        iby iby = new iby(context, (float[]) null);
        this.c = context;
        this.b = new apmi(iby);
    }

    private static final Thing[] c(aplu... apluArr) {
        if (apluArr == null) {
            return null;
        }
        int length = apluArr.length;
        Thing[] thingArr = new Thing[length];
        System.arraycopy(apluArr, 0, thingArr, 0, length);
        return thingArr;
    }

    public final acwa a(MutateRequest mutateRequest) {
        boolean isEmpty;
        apmi apmi = this.b;
        apmh apmh = new apmh(apmi, mutateRequest);
        acwi acwi = apmh.b.a;
        acwi.a((Executor) apmi, (acvp) apmi);
        synchronized (apmi.b) {
            isEmpty = apmi.b.isEmpty();
            apmi.b.add(apmh);
        }
        if (isEmpty) {
            apmh.a();
        }
        return acwi;
    }

    public final acwa b(aplu... apluArr) {
        try {
            return a(MutateRequest.b(c(apluArr)));
        } catch (ArrayStoreException e) {
            return acws.a((Exception) new aplk("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    public final acwa b(String... strArr) {
        return a(MutateRequest.b(strArr));
    }

    public final acwa a(aplu... apluArr) {
        apna apna;
        boolean z;
        try {
            Thing[] c2 = c(apluArr);
            if (axrj.a.a().c()) {
                int i = Build.VERSION.SDK_INT;
                Context context = this.c;
                if (context != null) {
                    if (c2 != null && (r1 = c2.length) > 0) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            apna = new apmz(context);
                        } else {
                            apna = new apmy(context);
                        }
                        for (Thing thing : c2) {
                            if (thing != null) {
                                String[] a2 = thing.c.a("sliceUri");
                                boolean z2 = true;
                                if (a2 == null || a2.length <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                boolean[] c3 = thing.c.c("grantSlicePermission");
                                if (c3 == null || c3.length <= 0 || !c3[0]) {
                                    z2 = false;
                                }
                                if (z && z2) {
                                    String str = a2[0];
                                    for (String a3 : a) {
                                        try {
                                            apna.a(a3, Uri.parse(str));
                                        } catch (Exception e) {
                                            String valueOf = String.valueOf(e);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                                            sb.append("Error trying to grant permission to Slice Uris: ");
                                            sb.append(valueOf);
                                            String sb2 = sb.toString();
                                            if (apmu.a(5)) {
                                                Log.w("FirebaseAppIndex", sb2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return a(MutateRequest.a(c2));
        } catch (ArrayStoreException e2) {
            return acws.a((Exception) new aplk("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    public final acwa a(String... strArr) {
        return a(MutateRequest.a(strArr));
    }
}
