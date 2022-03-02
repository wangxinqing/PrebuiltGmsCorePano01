package defpackage;

import android.graphics.Bitmap;

/* renamed from: akfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akfg extends akfm {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ boolean b;
    final /* synthetic */ akfh c;
    final /* synthetic */ akfj d;

    public akfg(akfj akfj, Bitmap bitmap, boolean z, akfh akfh) {
        this.d = akfj;
        this.a = bitmap;
        this.b = z;
        this.c = akfh;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(akfl... akflArr) {
        Bitmap bitmap = this.a;
        if (bitmap == null && (bitmap = super.doInBackground(akflArr)) != null && !this.b) {
            akfj akfj = this.d;
            akfl akfl = akflArr[0];
            boolean z = this.e;
            int i = akfj.a;
            akfj.a(akfl, bitmap, z);
        }
        return bitmap;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return doInBackground((akfl[]) objArr);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((Bitmap) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(Bitmap bitmap) {
        this.c.a(bitmap);
    }
}
