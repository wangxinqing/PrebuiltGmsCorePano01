package defpackage;

import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: jdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jdf implements jje {
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        String str = (String) obj;
        String[] split = str.trim().split("\t");
        int length = split.length;
        if (length < 5) {
            String valueOf = String.valueOf(str);
            Log.w("StatsUploader", valueOf.length() == 0 ? new String("Invalid data: ") : "Invalid data: ".concat(valueOf));
            return null;
        }
        aucd o = aohi.k.o();
        try {
            long parseLong = Long.parseLong(split[0]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aohi aohi = (aohi) o.b;
            aohi.a |= 1;
            aohi.b = parseLong;
            int parseInt = Integer.parseInt(split[1]);
            PackageManager packageManager = jdk.a;
            if (parseInt == 1) {
                i = 3;
            } else if (parseInt == 2) {
                i = 2;
            } else if (parseInt == 3) {
                i = 4;
            } else if (parseInt == 4) {
                i = 5;
            } else if (parseInt == 6) {
                i = 6;
            } else if (parseInt == 13) {
                i = 7;
            } else if (parseInt == 14) {
                i = 8;
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Wrong ServiceConnectionEventType: ");
                sb.append(parseInt);
                Log.e("StatsUploader", sb.toString());
                throw new IllegalArgumentException("Wrong ServiceConnectionEventType");
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aohi aohi2 = (aohi) o.b;
            aohi2.c = i - 1;
            aohi2.a |= 2;
            long parseLong2 = Long.parseLong(split[2]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aohi aohi3 = (aohi) o.b;
            aohi3.a |= 128;
            aohi3.i = parseLong2;
            String[] split2 = split[3].split("/");
            if (split2.length == 2) {
                String str2 = split2[0];
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aohi aohi4 = (aohi) o.b;
                str2.getClass();
                int i2 = aohi4.a | 4;
                aohi4.a = i2;
                aohi4.d = str2;
                String str3 = split2[1];
                str3.getClass();
                aohi4.a = i2 | 8;
                aohi4.e = str3;
                String[] split3 = split[4].split("/");
                if (split3.length == 2) {
                    String str4 = split3[0];
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aohi aohi5 = (aohi) o.b;
                    str4.getClass();
                    int i3 = aohi5.a | 16;
                    aohi5.a = i3;
                    aohi5.f = str4;
                    String str5 = split3[1];
                    str5.getClass();
                    int i4 = i3 | 32;
                    aohi5.a = i4;
                    aohi5.g = str5;
                    if (length > 5) {
                        String str6 = split[5];
                        str6.getClass();
                        aohi5.a = i4 | 64;
                        aohi5.h = str6;
                        if (length > 6) {
                            long parseLong3 = Long.parseLong(split[6]);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aohi aohi6 = (aohi) o.b;
                            aohi6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            aohi6.j = parseLong3;
                        }
                    }
                    return (aohi) o.i();
                }
            }
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
