package defpackage;

import android.content.SharedPreferences;

/* renamed from: crh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class crh extends cri {
    final /* synthetic */ Integer a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crh(crj crj, String str, Integer num) {
        super(crj, str);
        this.a = num;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? Integer.valueOf(sharedPreferences.getInt(this.b, 0)) : this.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            editor.putInt(this.b, num.intValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Integer");
    }
}
