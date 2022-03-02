package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Set;

/* renamed from: ivl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ivl implements SharedPreferences.Editor {
    private final boolean a;
    private final Context b;
    private final String c;
    private final boolean d;
    private final SharedPreferences.Editor e;
    private Bundle f;
    private Bundle g;
    private boolean h;

    public ivl(Context context, SharedPreferences sharedPreferences, String str, boolean z, boolean z2) {
        this.b = context;
        this.a = z;
        this.c = str;
        if (z) {
            this.e = null;
            a();
        } else {
            this.e = sharedPreferences.edit();
        }
        this.d = z2;
    }

    private final Bundle a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("FUNCTION_NAME", "edit");
        bundle.putBoolean("KEY_COMMIT", z);
        bundle.putBoolean("isDirectBoot", this.d);
        if (!this.g.isEmpty()) {
            bundle.putBundle("KEY_TYPES", this.g);
            bundle.putBundle("KEY_VALUES", this.f);
        }
        if (this.h) {
            bundle.putBoolean("KEY_CLEAR", true);
        }
        return bundle;
    }

    public final void apply() {
        if (this.a) {
            ivm.a(this.b, this.c, a(false));
            a();
            return;
        }
        this.e.apply();
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        if (this.a) {
            this.h = true;
            this.f.clear();
            this.g.clear();
        } else {
            this.e.clear();
        }
        return this;
    }

    public final boolean commit() {
        boolean z;
        if (!this.a) {
            return this.e.commit();
        }
        Bundle a2 = ivm.a(this.b, this.c, a(true));
        if (a2 != null) {
            z = a2.getBoolean("edit");
        } else {
            z = false;
        }
        a();
        return z;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        if (this.a) {
            this.f.putBoolean(str, z);
            this.g.putInt(str, 5);
        } else {
            this.e.putBoolean(str, z);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f2) {
        if (this.a) {
            this.f.putFloat(str, f2);
            this.g.putInt(str, 4);
        } else {
            this.e.putFloat(str, f2);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        if (this.a) {
            this.f.putInt(str, i);
            this.g.putInt(str, 2);
        } else {
            this.e.putInt(str, i);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        if (this.a) {
            this.f.putLong(str, j);
            this.g.putInt(str, 3);
        } else {
            this.e.putLong(str, j);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        if (this.a) {
            this.f.putString(str, str2);
            this.g.putInt(str, 0);
        } else {
            this.e.putString(str, str2);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        if (this.a) {
            this.f.putStringArray(str, (String[]) set.toArray(new String[0]));
            this.g.putInt(str, 1);
        } else {
            this.e.putStringSet(str, set);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        if (this.a) {
            this.f.remove(str);
            this.g.putInt(str, 6);
        } else {
            this.e.remove(str);
        }
        return this;
    }

    private final void a() {
        this.f = new Bundle();
        this.g = new Bundle();
        this.h = false;
    }
}
