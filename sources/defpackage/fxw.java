package defpackage;

import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.auth.appcert.be.AppCertChimeraService;
import java.io.IOException;

/* renamed from: fxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxw extends bhw implements fxx {
    private final fyq a;
    private final fxy b;

    public fxw() {
        super("com.google.android.gms.auth.appcert.IAppCertService");
    }

    public final String a(String str) {
        iva.a((Object) str, (Object) "Package name cannot be null!");
        this.a.a(Binder.getCallingUid());
        String str2 = null;
        if (!ent.H()) {
            AppCertChimeraService.a.a("DeviceKey is turned off", new Object[0]);
            return null;
        }
        fxy fxy = this.b;
        iva.a((Object) str, (Object) "Package name cannot be null!");
        if (!ent.H()) {
            fxy.a.a("DeviceKey is turned off", new Object[0]);
        } else {
            synchronized (fxy.e) {
                avpe a2 = fxy.d.a();
                if (a2 == null) {
                    fxy.a();
                    a2 = fxy.d.a();
                }
                if (a2 != null) {
                    if ((a2.a & 8) != 0) {
                        if (a2.d.a() != 0) {
                        }
                    }
                    fxy.a.e("Invalid device key.", new Object[0]);
                }
                try {
                    byte[] f = jhg.f(fxy.c.a, str);
                    if (f == null) {
                        fxy.a.e("Unable to get package certificate hash.", new Object[0]);
                    } else {
                        aucd o = alnn.d.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        alnn alnn = (alnn) o.b;
                        str.getClass();
                        alnn.a |= 1;
                        alnn.b = str;
                        String encodeToString = Base64.encodeToString(f, 2);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        alnn alnn2 = (alnn) o.b;
                        encodeToString.getClass();
                        alnn2.a |= 2;
                        alnn2.c = encodeToString;
                        aucd o2 = alno.g.o();
                        if (a2 != null) {
                            long j = a2.c;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            alno alno = (alno) o2.b;
                            int i = alno.a | 4;
                            alno.a = i;
                            alno.d = j;
                            long j2 = a2.b;
                            int i2 = i | 8;
                            alno.a = i2;
                            alno.e = j2;
                            auay auay = a2.e;
                            auay.getClass();
                            alno.a = i2 | 16;
                            alno.f = auay;
                            try {
                                String valueOf = String.valueOf(str);
                                String valueOf2 = String.valueOf(((alnn) o.b).c);
                                auay a3 = auay.a(fxy.a(a2, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                alno alno2 = (alno) o2.b;
                                a3.getClass();
                                alno2.a |= 2;
                                alno2.c = a3;
                            } catch (IOException | IllegalArgumentException e) {
                                iwd iwd = fxy.a;
                                String valueOf3 = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 40);
                                sb.append("Error while creating spatula signature: ");
                                sb.append(valueOf3);
                                iwd.e(sb.toString(), new Object[0]);
                            }
                        } else {
                            long a4 = jhg.a(fxy.c.a);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            alno alno3 = (alno) o2.b;
                            alno3.a |= 4;
                            alno3.d = a4;
                        }
                        alno alno4 = (alno) o2.b;
                        alnn alnn3 = (alnn) o.i();
                        alnn3.getClass();
                        alno4.b = alnn3;
                        alno4.a |= 1;
                        str2 = Base64.encodeToString(((alno) o2.i()).k(), 2);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    fxy.a.e("Invalid package name!", e2, new Object[0]);
                }
            }
        }
        return str2;
    }

    public final boolean b() {
        this.a.a(Binder.getCallingUid());
        if (ent.H()) {
            return this.b.a();
        }
        AppCertChimeraService.a.a("DeviceKey is turned off", new Object[0]);
        return false;
    }

    public fxw(fyq fyq, fxy fxy) {
        super("com.google.android.gms.auth.appcert.IAppCertService");
        this.a = fyq;
        this.b = fxy;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            boolean b2 = b();
            parcel2.writeNoException();
            bhx.a(parcel2, b2);
        } else if (i != 2) {
            return false;
        } else {
            String a2 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a2);
        }
        return true;
    }
}
