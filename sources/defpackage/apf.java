package defpackage;

import androidx.slice.SliceItem;

/* renamed from: apf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apf implements apk {
    final /* synthetic */ String a;
    final /* synthetic */ String[] b;
    final /* synthetic */ String[] c;

    public apf(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return apl.b(sliceItem, this.a) && apl.b(sliceItem, this.b) && !apl.a(sliceItem, this.c);
    }
}
