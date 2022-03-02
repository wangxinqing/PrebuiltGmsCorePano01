package defpackage;

/* renamed from: algz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algz {
    public String a = "Unknown";
    public String b = "Unknown";

    public static String a(String str, boolean z) {
        if ("VisibleUsingXml".equals(str) || "Visible".equals(str) || "Invisible".equals(str)) {
            if (!z) {
                if ("VisibleUsingXml".equals(str)) {
                    return "VisibleUsingXml_to_Invisible";
                }
                if ("Visible".equals(str)) {
                    return "Visible_to_Invisible";
                }
            } else if ("Invisible".equals(str)) {
                return "Invisible_to_Visible";
            }
            return str;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Illegal visibility state: ") : "Illegal visibility state: ".concat(valueOf));
    }

    public static final String c(boolean z, boolean z2) {
        return !z ? "Invisible" : !z2 ? "Visible" : "VisibleUsingXml";
    }

    public final void b(boolean z, boolean z2) {
        this.b = this.b.equals("Unknown") ? c(z, z2) : this.b;
    }

    public final void a(boolean z, boolean z2) {
        this.a = this.a.equals("Unknown") ? c(z, z2) : this.a;
    }
}
