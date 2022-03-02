package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PreviewChimeraActivity extends Activity implements AdapterView.OnItemClickListener {
    public HelpConfig a;
    public mup b;

    /* access modifiers changed from: package-private */
    public final void a(ErrorReport errorReport) {
        setContentView((int) R.layout.show_list_activity);
        try {
            this.b = new mup(this, errorReport);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(this.b);
            listView.setOnItemClickListener(this);
        } catch (NoSuchFieldException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("EXTRA_HELP_CONFIG") && (bundle == null || bundle.getParcelable("EXTRA_HELP_CONFIG") == null)) {
            ErrorReport j = FeedbackChimeraActivity.j();
            if (j == null) {
                finish();
                return;
            }
            if (ofy.a()) {
                ofy.a((Activity) this, j, (int) R.style.DialogActivityStyle, (int) R.style.DarkDialogActivityStyle, (int) R.style.DayNightDialogActivityStyle);
            } else if (ofy.a(j)) {
                setTheme(R.style.DarkDialogActivityStyle);
            }
            a(j);
            return;
        }
        HelpConfig a2 = HelpConfig.a(this, bundle, intent);
        if (a2 != null) {
            this.a = a2;
            if (ofy.a()) {
                ofy.a((Activity) this, a2, (int) R.style.DialogActivityStyle, (int) R.style.DarkDialogActivityStyle, (int) R.style.DayNightDialogActivityStyle);
            } else if (ofy.a(a2)) {
                setTheme(R.style.DarkDialogActivityStyle);
            }
            setTitle((int) R.string.gf_account_and_system_info_title);
            setContentView((int) R.layout.gf_preview_activity);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gf_account_and_system_info_viewer);
            recyclerView.setLayoutManager(new abk());
            recyclerView.setAdapter(new muc(this));
            return;
        }
        throw new IllegalStateException("No HelpConfig provided!");
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mup mup = this.b;
        if (mup != null) {
            muo muo = (muo) mup.a.get(i);
            if (muo.b()) {
                Intent className = new Intent().setClassName(mup.b, muo.b);
                className.putExtra("feedback.FIELD_NAME", muo.a);
                className.putExtra("feedback.FIELD_VALUE", muo.f);
                if (muo.f.equals("product specific binary data details")) {
                    className.putExtra("feedback.OBJECT_VALUE", muo.e.toString());
                }
                mup.b.startActivity(className);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        HelpConfig helpConfig = this.a;
        if (helpConfig != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", helpConfig);
            bundle.putLong("EXTRA_START_TICK", this.a.S);
        }
        super.onSaveInstanceState(bundle);
    }
}
