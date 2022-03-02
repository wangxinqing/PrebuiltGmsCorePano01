package defpackage;

import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsl {
    public int a = 0;
    public boolean b = false;
    public final List c = new ArrayList();

    public final UsageReportingOptInOptions a() {
        return new UsageReportingOptInOptions(this.a, this.b, this.c, 0, (String) null, false);
    }
}
