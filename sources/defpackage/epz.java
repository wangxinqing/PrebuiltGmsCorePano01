package defpackage;

/* renamed from: epz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epz {
    public static final enx a(String str) {
        String valueOf = String.valueOf(str);
        return new eqc(valueOf.length() == 0 ? new String("perm.") : "perm.".concat(valueOf));
    }

    public static final enx b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("perm.");
        sb.append(str);
        sb.append(".all_circles_visible");
        return new eqc(sb.toString());
    }

    public static final enx c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("perm.");
        sb.append(str);
        sb.append(".all_contacts_visible");
        return new eqc(sb.toString());
    }

    public static final enx d(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("perm.");
        sb.append(str);
        sb.append(".has_show_circles");
        return new eqc(sb.toString());
    }

    public static final enx e(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
        sb.append("perm.");
        sb.append(str);
        sb.append(".show_circles");
        return new eqc(sb.toString());
    }

    public static final enx f(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("perm.");
        sb.append(str);
        sb.append(".show_contacts");
        return new eqc(sb.toString());
    }

    public static final enx g(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("perm.");
        sb.append(str);
        sb.append(".visible_graph");
        return new eqg(sb.toString());
    }

    public static final enx h(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15);
        sb.append("perm.");
        sb.append(str);
        sb.append(".pacl.data");
        return new eqg(sb.toString());
    }

    public static final enx i(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("perm.");
        sb.append(str);
        sb.append(".pacl.visible_actions");
        return new eqg(sb.toString());
    }
}
