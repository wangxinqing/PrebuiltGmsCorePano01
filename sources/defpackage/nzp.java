package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: nzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzp {
    public final SharedPreferences.Editor a;
    public final /* synthetic */ nzr b;

    public nzp(nzr nzr, SharedPreferences.Editor editor) {
        this.b = nzr;
        this.a = editor;
    }

    public final void a() {
        this.a.apply();
    }

    public final void b(Map map) {
        for (Map.Entry key : map.entrySet()) {
            a(nzr.a((nzh) key.getKey()));
        }
    }

    public final void a(String str) {
        this.a.remove(this.b.a(str));
    }

    public final void a(String str, int i) {
        this.a.putInt(this.b.a(str), i);
    }

    public final void a(String str, long j) {
        this.a.putLong(this.b.a(str), j);
    }

    public final void a(String str, String str2) {
        this.a.putString(this.b.a(str), str2);
    }

    public final void a(String str, boolean z) {
        this.a.putBoolean(this.b.a(str), z);
    }

    public final void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a(nzr.a((nzh) entry.getKey()), (String) entry.getValue());
        }
    }
}
