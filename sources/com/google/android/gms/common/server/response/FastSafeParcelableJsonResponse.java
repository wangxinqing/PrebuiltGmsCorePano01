package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class FastSafeParcelableJsonResponse extends jag implements SafeParcelable {
    public Object c(String str) {
        return null;
    }

    public boolean d(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        jag jag = (jag) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (a(fastJsonResponse$Field)) {
                if (!jag.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(jag.b(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (jag.a(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (a(fastJsonResponse$Field)) {
                i = (i * 31) + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }
}
