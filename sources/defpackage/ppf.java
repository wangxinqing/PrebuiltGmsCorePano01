package defpackage;

import android.content.ContentResolver;

/* renamed from: ppf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppf implements Iterable {
    public static final String[] a = {"event_id", "title", "description", "eventLocation", "begin", "end", "allDay"};
    public static final String[] b = {"event_id", "attendeeName", "attendeeEmail", "attendeeType", "attendeeStatus"};
    private final ContentResolver c;
    private final long d;

    public ppf(ContentResolver contentResolver, long j) {
        this.c = contentResolver;
        this.d = j;
    }

    /* renamed from: a */
    public final ppe iterator() {
        return new ppe(this.c, this.d);
    }
}
