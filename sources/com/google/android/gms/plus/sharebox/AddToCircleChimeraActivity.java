package com.google.android.gms.plus.sharebox;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.Audience;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddToCircleChimeraActivity extends ListActivity implements View.OnClickListener {
    public static final /* synthetic */ int d = 0;
    public icc a;
    public final iqj b = new iqj(2097152);
    public AddToCircleData c;

    private final void a(String str) {
        Log.w("ShareBox", str);
        setResult(0);
        finish();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.done_button) {
            AddToCircleData addToCircleData = this.c;
            addToCircleData.a(addToCircleData.e, (Audience) null);
            Intent intent = new Intent();
            intent.putExtra("add_to_circle_data", this.c);
            setResult(-1, intent);
            finish();
            return;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof zkr)) {
            ((zkr) tag).e.toggle();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.c = (AddToCircleData) getIntent().getParcelableExtra("add_to_circle_data");
        } else {
            this.c = (AddToCircleData) bundle.getParcelable("add_to_circle_data");
        }
        AddToCircleData addToCircleData = this.c;
        if (addToCircleData != null) {
            Audience audience = addToCircleData.e;
            if (audience == null || audience.b.isEmpty()) {
                a("No un-circled audience members specified");
                return;
            }
            String stringExtra = getIntent().getStringExtra("calling_package_name");
            int intExtra = getIntent().getIntExtra("client_application_id", 0);
            ibz ibz = new ibz(this);
            ibz.b = stringExtra;
            ibq ibq = wlt.a;
            wlr a2 = wls.a();
            a2.a = intExtra;
            ibz.a(ibq, (ibj) a2.a());
            this.a = ibz.b();
            setTitle(R.string.plus_sharebox_circles_title);
            setContentView(R.layout.plus_add_to_circle_list_activity);
            getListView().setClickable(true);
            ((Button) findViewById(R.id.done_button)).setOnClickListener(this);
            setListAdapter(new zko(this));
            return;
        }
        a("Add to circle data not specified");
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("add_to_circle_data", this.c);
    }

    public final void onStart() {
        super.onStart();
        icc icc = this.a;
        if (icc != null && !icc.i() && !this.a.j()) {
            this.a.e();
        }
    }

    public final void onStop() {
        super.onStop();
        icc icc = this.a;
        if (icc == null) {
            return;
        }
        if (icc.i() || this.a.j()) {
            this.a.g();
        }
    }
}
