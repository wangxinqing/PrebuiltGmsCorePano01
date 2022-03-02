package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.ui.select.path.TopLevelView$MyDrivePathElement;
import com.google.android.gms.drive.ui.select.path.ViewPathElement;

/* renamed from: lqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqj {
    public static final TopLevelView$MyDrivePathElement a = new TopLevelView$MyDrivePathElement();
    public static final ViewPathElement b = new ViewPathElement(R.string.drive_view_shared_with_me, R.drawable.quantum_ic_supervisor_account_grey600_24, new FieldOnlyFilter((kyt) liu.h), lqu.b);
    public static final ViewPathElement c;
    public static final ViewPathElement[] d;
    private static final ViewPathElement e;

    static {
        FieldOnlyFilter fieldOnlyFilter = new FieldOnlyFilter((kyt) liu.j);
        Filter[] filterArr = {lim.a(lim.a(liu.b, (Object) "application/vnd.google-apps.folder"))};
        iva.a((Object) fieldOnlyFilter, (Object) "Filter may not be null.");
        iva.a((Object) filterArr, (Object) "Additional filters may not be null.");
        e = new ViewPathElement(R.string.drive_view_recent, R.drawable.quantum_ic_schedule_grey600_24, new LogicalFilter(Operator.f, fieldOnlyFilter, filterArr), lqu.c);
        ViewPathElement viewPathElement = new ViewPathElement(R.string.drive_filestate_starred, R.drawable.quantum_ic_grade_grey600_24, lim.a(liu.e, (Object) true), lqu.d);
        c = viewPathElement;
        d = new ViewPathElement[]{a, b, e, viewPathElement};
    }
}
