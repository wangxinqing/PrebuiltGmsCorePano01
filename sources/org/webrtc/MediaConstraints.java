package org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaConstraints {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class KeyValuePair {
        public final boolean equals(Object obj) {
            throw null;
        }

        public String getKey() {
            throw null;
        }

        public String getValue() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    private static String a(List list) {
        StringBuilder sb = new StringBuilder("[");
        if (list.size() > 0) {
            KeyValuePair keyValuePair = (KeyValuePair) list.get(0);
            if (sb.length() > 1) {
                sb.append(", ");
            }
            throw null;
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public List getMandatory() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public List getOptional() {
        return this.b;
    }

    public final String toString() {
        String a2 = a(this.a);
        String a3 = a(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 23 + String.valueOf(a3).length());
        sb.append("mandatory: ");
        sb.append(a2);
        sb.append(", optional: ");
        sb.append(a3);
        return sb.toString();
    }
}
