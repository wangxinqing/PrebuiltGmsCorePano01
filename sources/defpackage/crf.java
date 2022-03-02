package defpackage;

import android.content.SharedPreferences;

/* renamed from: crf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class crf extends cri {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crf(crj crj, String str, String str2) {
        super(crj, str);
        this.a = str2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, this.a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        String str = (String) obj;
        if (str != null) {
            editor.putString(this.b, str);
            return;
        }
        throw new IllegalArgumentException("null cannot be written for String");
    }
}
