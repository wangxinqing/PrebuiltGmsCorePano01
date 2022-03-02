package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rct();
    public final List a;
    public Bundle b = null;

    public static boolean a(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
        }
        return false;
    }

    public static ActivityTransitionResult b(Intent intent) {
        if (a(intent)) {
            return (ActivityTransitionResult) ivy.a(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ActivityTransitionResult) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        boolean z;
        iva.a((Object) list, (Object) "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                if (((ActivityTransitionEvent) list.get(i)).c >= ((ActivityTransitionEvent) list.get(i - 1)).c) {
                    z = true;
                } else {
                    z = false;
                }
                iva.b(z);
            }
        }
        this.a = Collections.unmodifiableList(list);
        this.b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
