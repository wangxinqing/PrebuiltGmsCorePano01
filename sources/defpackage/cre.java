package defpackage;

import android.content.SharedPreferences;

/* renamed from: cre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cre extends cri {
    final /* synthetic */ Long a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cre(crj crj, String str, Long l) {
        super(crj, str);
        this.a = l;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? Long.valueOf(sharedPreferences.getLong(this.b, 0)) : this.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            editor.putLong(this.b, l.longValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Long");
    }
}
