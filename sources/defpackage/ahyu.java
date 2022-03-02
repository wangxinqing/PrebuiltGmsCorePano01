package defpackage;

import java.util.Locale;

/* renamed from: ahyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyu extends RuntimeException {
    public ahyu(String str, Thread thread, Thread thread2) {
        super(String.format(Locale.ENGLISH, "%s has affinity to Thread[id=%d, name='%s'], but found on Thread[id=%d, name='%s'].", new Object[]{str, Long.valueOf(thread.getId()), thread.getName(), Long.valueOf(thread2.getId()), thread2.getName()}));
    }
}
