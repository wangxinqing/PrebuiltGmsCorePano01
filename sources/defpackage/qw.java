package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: qw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qw {
    private final AccessibilityRecord a;

    @Deprecated
    public qw(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final void a(View view) {
        this.a.setSource(view);
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw)) {
            return false;
        }
        qw qwVar = (qw) obj;
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            if (qwVar.a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(qwVar.a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord != null) {
            return accessibilityRecord.hashCode();
        }
        return 0;
    }
}
