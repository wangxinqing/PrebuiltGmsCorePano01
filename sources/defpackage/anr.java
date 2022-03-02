package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: anr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anr {
    public final ArrayList a = new ArrayList();
    public SliceSpec b;
    private final Uri c;
    private final ArrayList d = new ArrayList();
    private int e;

    public anr(Uri uri) {
        this.c = uri;
    }

    public final Slice a() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = this.d;
        return new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), this.c, this.b);
    }

    @Deprecated
    public final void b(long j, String str, String... strArr) {
        this.a.add(new SliceItem(Long.valueOf(j), "long", str, strArr));
    }

    public final void a(int i, String str, String... strArr) {
        this.a.add(new SliceItem(Integer.valueOf(i), "int", str, strArr));
    }

    public anr(anr anr) {
        Uri.Builder appendPath = anr.c.buildUpon().appendPath("_gen");
        int i = anr.e;
        anr.e = i + 1;
        this.c = appendPath.appendPath(String.valueOf(i)).build();
    }

    public final void a(long j, String str, String... strArr) {
        this.a.add(new SliceItem(Long.valueOf(j), "long", str, strArr));
    }

    public final void a(PendingIntent pendingIntent, Slice slice, String str) {
        ot.a((Object) pendingIntent);
        ot.a((Object) slice);
        this.a.add(new SliceItem(new oq(pendingIntent, slice), "action", str, slice.e));
    }

    public final void a(IconCompat iconCompat, String str, List list) {
        ot.a((Object) iconCompat);
        if (Slice.a(iconCompat)) {
            a(iconCompat, str, (String[]) list.toArray(new String[list.size()]));
        }
    }

    public final void a(IconCompat iconCompat, String str, String... strArr) {
        ot.a((Object) iconCompat);
        if (Slice.a(iconCompat)) {
            this.a.add(new SliceItem(iconCompat, "image", str, strArr));
        }
    }

    public final void a(Slice slice) {
        ot.a((Object) slice);
        a(slice, (String) null);
    }

    public final void a(Slice slice, String str) {
        ot.a((Object) slice);
        this.a.add(new SliceItem(slice, "slice", str, slice.e));
    }

    public final void a(SliceItem sliceItem) {
        this.a.add(sliceItem);
    }

    public final void a(CharSequence charSequence, String str, String... strArr) {
        this.a.add(new SliceItem(charSequence, "text", str, strArr));
    }

    public final void a(List list) {
        a((String[]) list.toArray(new String[list.size()]));
    }

    public final void a(String... strArr) {
        this.d.addAll(Arrays.asList(strArr));
    }
}
