package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: ezf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezf {
    private final Status a;
    private final amri b;

    private ezf(Status status, amri amri) {
        iva.a((Object) status);
        this.a = status;
        this.b = amri;
    }

    public static ezf a() {
        return new ezf(Status.e, ampu.a);
    }

    public static ezf b(String str) {
        return new ezf(new Status(13, str), ampu.a);
    }

    public final Intent c() {
        Intent intent = new Intent();
        ivy.a((SafeParcelable) this.a, intent, "status");
        if (this.b.a()) {
            ivy.a((SafeParcelable) this.b.b(), intent, "sign_in_credential");
        }
        return intent;
    }

    public static ezf a(SignInCredential signInCredential) {
        return new ezf(Status.a, amri.b(signInCredential));
    }

    public final int b() {
        return this.b.a() ? -1 : 0;
    }

    public static ezf a(String str) {
        return new ezf(new Status(10, str), ampu.a);
    }
}
