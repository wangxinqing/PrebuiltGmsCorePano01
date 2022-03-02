package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eqf extends eqi {
    public eqf(String str) {
        super(str);
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return new HashSet(Arrays.asList(TextUtils.split(str, ",")));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return TextUtils.join(",", (Set) obj);
    }
}
