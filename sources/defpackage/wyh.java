package defpackage;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: wyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyh extends jag {
    private static final HashMap c;
    public final Set a = new HashSet();
    public List b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("items", FastJsonResponse$Field.b("items", 2, Person.class));
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final Object c(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean d(String str) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wyh)) {
            return false;
        }
        if (this != obj) {
            wyh wyh = (wyh) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!wyh.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(wyh.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (wyh.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
            if (a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        String canonicalName = jag.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
