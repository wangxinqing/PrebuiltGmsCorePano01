package defpackage;

import android.graphics.Bitmap;

/* renamed from: akff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akff extends akfm {
    final /* synthetic */ boolean a;
    final /* synthetic */ akfj b;

    public akff(akfj akfj, boolean z) {
        this.b = akfj;
        this.a = z;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(akfl... akflArr) {
        Bitmap a2 = super.doInBackground(akflArr);
        if (a2 != null && !this.a) {
            akfj akfj = this.b;
            akfl akfl = akflArr[0];
            boolean z = this.e;
            int i = akfj.a;
            akfj.a(akfl, a2, z);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return doInBackground((akfl[]) objArr);
    }
}
