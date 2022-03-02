package com.google.android.gms.mdi.download.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DebugUiChimeraActivity extends bjs {
    public ArrayAdapter a;

    public final void e() {
        new iby((Context) this, (int[]) null).a((ihb) new rxg()).a((acvv) new sds(this));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mdd_debug_activity);
        setTitle((int) R.string.mdd_debug_ui_title);
        ((Button) findViewById(R.id.refresh_file_group_list)).setOnClickListener(new sdi(this));
        ((Button) findViewById(R.id.delete_all_downloaded_files)).setOnClickListener(new sdj(this));
        ((Button) findViewById(R.id.trigger_download)).setOnClickListener(new sdk(this));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, new ArrayList());
        this.a = arrayAdapter;
        ((ListView) findViewById(R.id.file_group_list)).setAdapter(arrayAdapter);
        e();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Trigger Maintenance Task").setOnMenuItemClickListener(new sdt(this));
        return super.onCreateOptionsMenu(menu);
    }
}
