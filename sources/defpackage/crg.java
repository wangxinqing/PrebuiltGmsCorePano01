package defpackage;

import android.content.SharedPreferences;

/* renamed from: crg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class crg extends cri {
    final /* synthetic */ Boolean a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crg(crj crj, String str, Boolean bool) {
        super(crj, str);
        this.a = bool;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? Boolean.valueOf(sharedPreferences.getBoolean(this.b, false)) : this.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            editor.putBoolean(this.b, bool.booleanValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Boolean");
    }
}
