package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IcingManageSpaceChimeraActivity extends bjs implements AdapterView.OnItemClickListener {
    public View a;
    public View b;
    public TextView c;
    public ListView d;
    public TextView e;
    private pto f;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.icing_manage_space_activity);
        this.a = findViewById(R.id.main_view);
        this.b = findViewById(R.id.icing_progress_bar);
        this.c = (TextView) findViewById(R.id.total_size_text);
        ListView listView = (ListView) findViewById(R.id.apps_list);
        this.d = listView;
        listView.setOnItemClickListener(this);
        TextView textView = (TextView) findViewById(R.id.empty_list_view);
        this.e = textView;
        this.d.setEmptyView(textView);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.icing_manage_settings_menu, menu);
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ptr ptr = (ptr) this.d.getAdapter();
        if (ptr != null && i >= 0 && i < ptr.getCount()) {
            String str = ptr.getItem(i).a;
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, (String) null));
            startActivity(intent);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.icing_settings_help) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) ozx.U.c())));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            iz.a(getContainerActivity());
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f.cancel(true);
        this.f = null;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        pto pto = new pto(this);
        this.f = pto;
        pto.execute(new Void[0]);
        new oyq(getApplicationContext()).b(8004);
    }
}
