package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: ahub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahub extends ahvs {
    private final int d;
    private final int e;

    public ahub(Context context, ahsr ahsr, ahss ahss, ajrh ajrh, aizy aizy, int i, int i2) {
        super(context, ahsr, ahss, ajrh);
        this.d = i;
        this.e = i2;
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, int i2, long j) {
        boolean z;
        ahsr ahsr = this.h;
        ahsr.post(new ahsq(ahsr, this.d, this.e));
        ahvv ahvv = new ahvv(this.d, this.e, i, i2);
        ahvv.h = j;
        float[] fArr = new float[i];
        while (true) {
            boolean z2 = true;
            if (!ahvs.a) {
                return true;
            }
            int read = ahvs.b.read(fArr, 0, i, 0);
            if (read >= 0) {
                if (i % ahvv.d == 0) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.a(z);
                if (i > ahvv.e * ahvv.d) {
                    z2 = false;
                }
                amrl.a(z2);
                int i3 = read / ahvv.d;
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= i3) {
                        break;
                    }
                    if (ahvv.g < ahvv.b) {
                        ahwk ahwk = ahvv.f;
                        int i7 = ahvv.d;
                        arrayList.addAll(ahwk.a(fArr, i4 * i7, i7 * i5));
                    }
                    int i8 = ahvv.g;
                    int i9 = ahvv.c;
                    int i10 = (i8 + i5) % i9;
                    ahvv.g = i10;
                    int i11 = ahvv.b;
                    i5 = i10 < i11 ? i11 - i10 : i9 - i10;
                    i4 = i6;
                }
                int i12 = i3 - i4;
                if (ahvv.g < ahvv.b) {
                    ahwk ahwk2 = ahvv.f;
                    int i13 = ahvv.d;
                    arrayList.addAll(ahwk2.a(fArr, i4 * i13, i13 * i12));
                }
                ahvv.g = (ahvv.g + i12) % ahvv.c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(new ahvu((float[]) arrayList.get(i14), ahvv.h, ahvv.d));
                    ahvv.h += (long) ahvv.a;
                }
                int size2 = arrayList2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ((ahvr) arrayList2.get(i15)).a(this.h);
                }
            } else {
                Locale.getDefault();
                new Object[1][0] = Integer.valueOf(read);
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final AudioFormat c() {
        return new AudioFormat.Builder().setChannelIndexMask(15).setEncoding(4).setSampleRate(48000).build();
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return 48000;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public final int g() {
        return 6;
    }
}
