package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: aacn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aacn {
    final int a;
    final int b;
    final ComponentName c;
    final aabx d;

    public aacn(aabx aabx) {
        this.a = aabx.k();
        Integer num = aabx.g;
        this.b = (num == null ? -1 : num).intValue();
        this.c = aabx.a.f();
        aabx.a.o();
        this.d = aabx;
    }

    /* access modifiers changed from: package-private */
    public final Intent a() {
        if (!this.d.c()) {
            return new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setComponent(this.c);
        }
        String concat = String.valueOf(this.c.getClassName()).concat(".ACTION_TASK_READY");
        Intent a2 = qyg.a(this.d.f, concat);
        return a2 == null ? new Intent(concat).setPackage(this.c.getPackageName()) : a2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aacn) {
            aacn aacn = (aacn) obj;
            return this.a == aacn.a && this.b == aacn.b && this.c.equals(aacn.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c});
    }
}
