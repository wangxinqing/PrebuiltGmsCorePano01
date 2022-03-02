package defpackage;

import androidx.slice.SliceItem;

/* renamed from: aph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aph implements apk {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public aph(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return apl.b(sliceItem, this.a) && apl.c(sliceItem, this.b);
    }
}
