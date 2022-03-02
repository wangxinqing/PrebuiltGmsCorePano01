package defpackage;

import com.google.android.location.utils.ParcelableByteArray;
import java.util.List;

/* renamed from: aiqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiqp extends aibb {
    public final ikh b;

    public aiqp(ikh ikh) {
        this.b = ikh;
    }

    public final void b() {
        super.b();
        ikh ikh = this.b;
        synchronized (ikh.a) {
            if (!ikh.a()) {
                ikh.b.add(new ikc(ikh));
            } else {
                ikh.c();
                ikh.e();
            }
        }
    }

    public final void c() {
        super.b();
        List d = this.b.d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            ParcelableByteArray parcelableByteArray = (ParcelableByteArray) d.get(i);
            byte b2 = parcelableByteArray.a;
            if (b2 != 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Found unknown version ");
                sb.append(b2);
                sb.toString();
            } else {
                byte b3 = parcelableByteArray.b;
                if (b3 != 0) {
                    StringBuilder sb2 = new StringBuilder(23);
                    sb2.append("Found unknown type ");
                    sb2.append(b3);
                    sb2.toString();
                } else {
                    aibr aibr = new aibr(parcelableByteArray.c);
                    if (aibr.a()) {
                        long d2 = aibr.d();
                        StringBuilder sb3 = new StringBuilder(50);
                        sb3.append("Recovered scan with timestamp ");
                        sb3.append(d2);
                        sb3.toString();
                        this.a.add(aibr);
                    }
                }
            }
        }
    }
}
