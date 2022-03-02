package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: alsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alsw {
    public static final alsw a = new alsw(EnumSet.noneOf(alsv.class), (amiw) null);
    public static final alsw b = new alsw(h, (amiw) null);
    private static final EnumSet e = EnumSet.of(alsv.ADD_TO_UNDO, alsv.TRUNCATE_UNDO, alsv.POP_UNDO);
    private static final EnumSet f = EnumSet.of(alsv.ADD_TO_REDO, alsv.TRUNCATE_REDO, alsv.POP_REDO);
    private static final EnumSet g = EnumSet.of(alsv.ADD_TO_PENDING_BATCH);
    private static final EnumSet h = EnumSet.of(alsv.REFRESH_UNDO, alsv.REFRESH_REDO, alsv.REFRESH_PENDING_BATCH);
    public final Set c;
    public final amiw d;

    public alsw(EnumSet enumSet, amiw amiw) {
        EnumSet copyOf = EnumSet.copyOf(enumSet);
        boolean contains = copyOf.contains(alsv.ADD_TO_UNDO);
        boolean contains2 = copyOf.contains(alsv.ADD_TO_REDO);
        boolean contains3 = copyOf.contains(alsv.ADD_TO_PENDING_BATCH);
        amiw amiw2 = null;
        if (contains ? contains2 || contains3 : contains2 && contains3) {
            copyOf.addAll(h);
            amiw = null;
        }
        if (copyOf.contains(alsv.REFRESH_UNDO)) {
            amiw = copyOf.contains(alsv.ADD_TO_UNDO) ? null : amiw;
            copyOf.removeAll(e);
        }
        if (copyOf.contains(alsv.REFRESH_REDO)) {
            amiw = copyOf.contains(alsv.ADD_TO_REDO) ? null : amiw;
            copyOf.removeAll(f);
        }
        if (copyOf.contains(alsv.REFRESH_PENDING_BATCH)) {
            amiw2 = !copyOf.contains(alsv.ADD_TO_PENDING_BATCH) ? amiw : amiw2;
            copyOf.removeAll(g);
            amiw = amiw2;
        }
        this.c = Collections.unmodifiableSet(copyOf);
        this.d = amiw;
    }

    public final alsw a(alsw alsw) {
        if (this.d != null && alsw.d != null) {
            return new alsw(h, (amiw) null);
        }
        if (this.c.isEmpty() && alsw.c.isEmpty()) {
            return new alsw(EnumSet.noneOf(alsv.class), (amiw) null);
        }
        if (this.c.isEmpty()) {
            return alsw;
        }
        if (alsw.c.isEmpty()) {
            return this;
        }
        EnumSet copyOf = EnumSet.copyOf(this.c);
        copyOf.addAll(alsw.c);
        amiw amiw = this.d;
        if (amiw == null) {
            amiw = alsw.d;
        }
        return new alsw(copyOf, amiw);
    }
}
