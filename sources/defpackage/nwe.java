package defpackage;

import android.content.Context;
import android.os.Binder;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: nwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nwe {
    public static final Pattern a = Pattern.compile(" +");
    private static final Pattern d = Pattern.compile("\\W");
    private static nwe e = new nwe(new nwc[0]);
    private static Object f;
    public final nwc[] b;
    public final Pattern c;

    public nwe(nwc[] nwcArr) {
        Arrays.sort(nwcArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < nwcArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(d.matcher(nwcArr[i].a).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.c = Pattern.compile(sb.toString());
        this.b = nwcArr;
    }

    public static synchronized nwe a(Context context) {
        nwe nwe;
        long clearCallingIdentity;
        synchronized (nwe.class) {
            long clearCallingIdentity2 = Binder.clearCallingIdentity();
            try {
                Object a2 = aeeg.a(context.getContentResolver());
                Binder.restoreCallingIdentity(clearCallingIdentity2);
                if (a2 != f) {
                    clearCallingIdentity = Binder.clearCallingIdentity();
                    Map a3 = aeeg.a(context.getContentResolver(), "url:");
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : a3.entrySet()) {
                        ((String) entry.getKey()).substring(4);
                        String str = (String) entry.getValue();
                        if (!(str == null || str.length() == 0)) {
                            arrayList.add(new nwc(str));
                        }
                    }
                    nwe = new nwe((nwc[]) arrayList.toArray(new nwc[arrayList.size()]));
                    e = nwe;
                    f = a2;
                } else {
                    nwe = e;
                }
            } catch (nwd e2) {
                Log.e("UrlRules", "Invalid rule from Gservices", e2);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
        return nwe;
    }
}
