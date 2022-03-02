package defpackage;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: jde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jde implements jje {
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        String str = (String) obj;
        String[] split = str.trim().split("\t");
        if (split.length < 11) {
            String valueOf = String.valueOf(str);
            Log.w("StatsUploader", valueOf.length() == 0 ? new String("Invalid data: ") : "Invalid data: ".concat(valueOf));
            return null;
        }
        aucd o = aoge.m.o();
        try {
            long parseLong = Long.parseLong(split[0]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge = (aoge) o.b;
            aoge.a |= 1;
            aoge.b = parseLong;
            int parseInt = Integer.parseInt(split[1]);
            PackageManager packageManager = jdk.a;
            if (parseInt == 0) {
                i = 5;
            } else if (parseInt == 1) {
                i = 4;
            } else if (parseInt == 2) {
                i = 3;
            } else if (parseInt == 3) {
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Wrong alarm event type: ");
                sb.append(parseInt);
                Log.e("StatsUploader", sb.toString());
                throw new IllegalArgumentException("Wrong alarm event type");
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge2 = (aoge) o.b;
            aoge2.c = i - 1;
            int i2 = aoge2.a | 2;
            aoge2.a = i2;
            String str2 = split[2];
            str2.getClass();
            aoge2.a = i2 | 4;
            aoge2.d = str2;
            long parseLong2 = Long.parseLong(split[3]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge3 = (aoge) o.b;
            aoge3.a |= 8;
            aoge3.e = parseLong2;
            long parseLong3 = Long.parseLong(split[4]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge4 = (aoge) o.b;
            aoge4.a |= 16;
            aoge4.f = parseLong3;
            long parseLong4 = Long.parseLong(split[5]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge5 = (aoge) o.b;
            aoge5.a |= 32;
            aoge5.g = parseLong4;
            int parseInt2 = Integer.parseInt(split[6]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge6 = (aoge) o.b;
            aoge6.a |= 64;
            aoge6.i = parseInt2;
            if (!TextUtils.isEmpty(split[7])) {
                List asList = Arrays.asList(TextUtils.split(split[7], ","));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoge aoge7 = (aoge) o.b;
                if (!aoge7.h.a()) {
                    aoge7.h = aucj.a(aoge7.h);
                }
                auab.a((Iterable) asList, (List) aoge7.h);
            }
            long parseLong5 = Long.parseLong(split[8]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge8 = (aoge) o.b;
            aoge8.a |= 128;
            aoge8.j = parseLong5;
            if (!TextUtils.isEmpty(split[9])) {
                String str3 = split[9];
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoge aoge9 = (aoge) o.b;
                str3.getClass();
                aoge9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                aoge9.k = str3;
            }
            float parseFloat = Float.parseFloat(split[10]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoge aoge10 = (aoge) o.b;
            aoge10.a |= 512;
            aoge10.l = parseFloat;
            return (aoge) o.i();
        } catch (IllegalArgumentException | NumberFormatException e) {
            return null;
        }
    }
}
