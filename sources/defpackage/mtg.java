package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import java.util.List;

/* renamed from: mtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mtg implements arxd {
    private final mtk a;

    public mtg(mtk mtk) {
        this.a = mtk;
    }

    public final void a(List list) {
        mtk mtk = this.a;
        jjg jjg = mte.a;
        list.size();
        mtk.a.clear();
        mtk.a.addAll(list);
        if (mtk.getContext() != null) {
            ContentResolver contentResolver = mtk.getContext().getContentResolver();
            contentResolver.notifyChange(aryo.a("device_status_list_item"), (ContentObserver) null);
            contentResolver.notifyChange(aryo.a("pair_header_suggestion"), (ContentObserver) null);
        }
    }
}
