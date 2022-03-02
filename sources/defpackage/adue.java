package defpackage;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.userlocation.SemanticLocation;

/* renamed from: adue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adue {
    public final SemanticLocation a;
    private final SemanticLocation b;

    public adue(SemanticLocation semanticLocation, SemanticLocation semanticLocation2) {
        this.b = semanticLocation;
        this.a = semanticLocation2;
    }

    public static adue a(SemanticLocation semanticLocation, SemanticLocation semanticLocation2) {
        if (semanticLocation2 != null) {
            return new adue(semanticLocation, semanticLocation2);
        }
        return null;
    }

    public final Intent a() {
        Intent intent = new Intent();
        SemanticLocation semanticLocation = this.b;
        if (semanticLocation != null) {
            ivy.a((SafeParcelable) semanticLocation, intent, "com.google.android.userlocation.extra.previous_location");
        }
        ivy.a((SafeParcelable) this.a, intent, "com.google.android.userlocation.extra.current_location");
        return intent;
    }
}
