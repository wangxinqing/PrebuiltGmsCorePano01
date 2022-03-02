package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;

/* renamed from: oiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class oiy extends bjs implements nzu {
    public HelpConfig x;
    public okc y;
    protected int z;

    public final HelpConfig f() {
        return this.x;
    }

    public final okc h() {
        return this.y;
    }

    public Context k() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.x = HelpConfig.a(this, bundle, getIntent());
        this.y = new okc(this);
        boolean a = nzf.a(this.x);
        int i = R.style.gh_ActivityStyleWithDarkActionBar;
        if (!a && this.x.A.a == 0) {
            i = R.style.gh_ActivityStyle;
        }
        setTheme(i);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        okc okc = this.y;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.z = 24;
        finish();
        return true;
    }

    public void onPause() {
        ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, this.x);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, this.x.b);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("EXTRA_HELP_CONFIG", this.x);
        super.onSaveInstanceState(bundle);
    }
}
