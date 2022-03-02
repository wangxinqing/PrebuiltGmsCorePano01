package defpackage;

import android.content.Context;
import android.widget.SectionIndexer;
import java.util.ArrayList;

/* renamed from: zno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class zno extends znq implements SectionIndexer {
    private znn[] a = new znn[0];

    public zno(Context context) {
        super(context);
    }

    public final int getPositionForSection(int i) {
        znn[] znnArr = this.a;
        if (i < znnArr.length) {
            return znnArr[i].a;
        }
        return 0;
    }

    public final int getSectionForPosition(int i) {
        int i2 = 1;
        while (true) {
            znn[] znnArr = this.a;
            if (i2 >= znnArr.length) {
                return 0;
            }
            if (znnArr[i2].a > i) {
                return i2 - 1;
            }
            i2++;
        }
    }

    public final Object[] getSections() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        ArrayList arrayList = new ArrayList();
        this.P.a(arrayList, 0);
        this.a = (znn[]) arrayList.toArray(new znn[arrayList.size()]);
    }
}
