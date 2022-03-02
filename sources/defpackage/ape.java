package defpackage;

import androidx.slice.SliceItem;

/* renamed from: ape  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ape implements apk {
    final /* synthetic */ String a;
    final /* synthetic */ String[] b;

    public ape(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return apl.b(sliceItem, this.a) && apl.b(sliceItem, this.b) && !apl.a(sliceItem, (String[]) null);
    }
}
