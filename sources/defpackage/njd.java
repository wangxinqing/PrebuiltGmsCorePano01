package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.LruCache;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: njd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njd {
    static final LruCache a = new LruCache((int) awyg.a.a().l());

    public static nig a(int i) {
        return (nig) a.get(Integer.valueOf(i));
    }

    public static nig b(GetServiceRequest getServiceRequest, int i) {
        if (Binder.getCallingUid() == jhg.a) {
            return null;
        }
        aucd o = nig.g.o();
        int i2 = getServiceRequest.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nig nig = (nig) o.b;
        int i3 = nig.a | 2;
        nig.a = i3;
        nig.c = i2;
        int i4 = i - 1;
        if (i != 0) {
            nig.f = i4;
            int i5 = i3 | 16;
            nig.a = i5;
            if (i == 3 || i == 6) {
                String str = getServiceRequest.d;
                str.getClass();
                nig.a = i5 | 1;
                nig.b = str;
                try {
                    PackageInfo b = jni.b(ihs.b()).b(((nig) o.b).b, 0);
                    if (b != null) {
                        if (b.versionName != null) {
                            String str2 = b.versionName;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            nig nig2 = (nig) o.b;
                            str2.getClass();
                            nig2.a |= 8;
                            nig2.e = str2;
                        }
                        int i6 = b.versionCode;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        nig nig3 = (nig) o.b;
                        nig3.a |= 4;
                        nig3.d = i6;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String str3 = ((nig) o.b).b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 34);
                    sb.append("Cannot get application info for [");
                    sb.append(str3);
                    sb.append("]");
                    sb.toString();
                }
            }
            return (nig) o.i();
        }
        throw null;
    }

    public static void a(GetServiceRequest getServiceRequest, int i) {
        nig b = b(getServiceRequest, i);
        if (b != null) {
            a.put(Integer.valueOf(Binder.getCallingUid()), b);
        }
    }
}
