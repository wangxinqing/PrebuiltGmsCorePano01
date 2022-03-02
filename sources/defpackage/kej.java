package defpackage;

import android.content.Context;
import android.content.IntentSender;
import com.google.android.cast.JGCastService;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.ui.select.SelectFileChimeraActivity;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kej {
    private static final Filter a = lim.a(lim.a(liu.b, (Object) "application/vnd.google-apps.folder"));

    public static IntentSender a(Context context, khq khq, OpenFileIntentSenderRequest openFileIntentSenderRequest, lfr lfr) {
        Filter filter;
        int length;
        iva.a(khq.a((Set) EnumSet.of(jzl.FULL, jzl.FILE)), (Object) "Insufficient scopes");
        DriveId driveId = openFileIntentSenderRequest.c;
        String str = openFileIntentSenderRequest.a;
        String[] strArr = openFileIntentSenderRequest.b;
        FilterHolder filterHolder = openFileIntentSenderRequest.d;
        LogicalFilter logicalFilter = null;
        if (filterHolder != null) {
            filter = filterHolder.j;
        } else {
            filter = null;
        }
        if (strArr != null && (length = strArr.length) > 0) {
            ArrayList arrayList = new ArrayList(length);
            for (String a2 : strArr) {
                arrayList.add(lim.a((kyt) lce.N, (Object) a2));
            }
            iva.a((Object) arrayList, (Object) "Filters may not be null");
            logicalFilter = new LogicalFilter(Operator.g, (Iterable) arrayList);
        }
        if (logicalFilter == null || filter == null) {
            if (logicalFilter == null && filter == null) {
                filter = a;
            } else if (logicalFilter != null) {
                filter = logicalFilter;
            }
            String str2 = khq.a.a;
            String str3 = khq.b;
            String str4 = khq.c.b;
            lgc d = ((lfv) lfr).d();
            d.i();
            d.c(0, 15);
            lpd a3 = SelectFileChimeraActivity.a(context, str2, str3, str4);
            a3.a(str);
            a3.a(filter);
            a3.a(driveId);
            a3.a(true);
            IntentSender intentSender = jhg.a(context, a3.a, (int) JGCastService.FLAG_PRIVATE_DISPLAY).getIntentSender();
            d.h();
            d.a();
            return intentSender;
        }
        throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
    }
}
