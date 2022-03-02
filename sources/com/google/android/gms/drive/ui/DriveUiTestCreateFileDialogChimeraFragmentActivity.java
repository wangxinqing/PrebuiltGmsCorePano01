package com.google.android.gms.drive.ui;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DriveUiTestCreateFileDialogChimeraFragmentActivity extends FragmentActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        loj loj = new loj();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        MetadataBundle a = MetadataBundle.a();
        a.b(lce.Q, "ui tester file title");
        a.b(lce.N, "application/octet-stream");
        extras.putParcelable("metadata", a);
        extras.putString("accountName", "driveUiTester");
        extras.putString("dialogTitle", "ui tester dialog title");
        loj.setArguments(extras);
        loj.show(getSupportFragmentManager(), "DriveUiTestCreateFileDi");
    }
}
