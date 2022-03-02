package defpackage;

import android.text.TextUtils;

/* renamed from: epy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class epy extends eqi {
    public epy(String str) {
        super(str);
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return TextUtils.split(str, ",");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return TextUtils.join(",", (String[]) obj);
    }
}
