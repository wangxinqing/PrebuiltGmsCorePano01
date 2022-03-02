package org.webrtc;

import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SessionDescription {
    public final Type a;
    public final String b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER;

        public static Type fromCanonicalForm(String str) {
            return (Type) Enum.valueOf(Type.class, str.toUpperCase(Locale.US));
        }
    }

    public SessionDescription(Type type, String str) {
        this.a = type;
        this.b = str;
    }

    /* access modifiers changed from: package-private */
    public String getDescription() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public String getTypeInCanonicalForm() {
        return this.a.name().toLowerCase(Locale.US);
    }
}
