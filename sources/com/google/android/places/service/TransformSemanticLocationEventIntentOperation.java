package com.google.android.places.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.userlocation.SemanticLocation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TransformSemanticLocationEventIntentOperation extends IntentOperation {
    public TransformSemanticLocationEventIntentOperation() {
        this(new akxf(), new akva());
    }

    private final void a(Intent intent) {
        adue adue;
        rhj rhj;
        if (intent != null) {
            adue = adue.a((SemanticLocation) ivy.a(intent, "com.google.android.userlocation.extra.previous_location", SemanticLocation.CREATOR), (SemanticLocation) ivy.a(intent, "com.google.android.userlocation.extra.current_location", SemanticLocation.CREATOR));
        } else {
            adue = null;
        }
        if (adue != null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_INTENT_EXTRA");
            if (pendingIntent != null) {
                boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_USE_HIERARCHIES_EXTRA", true);
                String stringExtra = intent.getStringExtra("com.google.android.userlocation.SemanticLocationEvent.LEGACY_CALL_ACCOUNT_NAME_EXTRA");
                if (booleanExtra) {
                    rhj = akut.a(adue, true);
                } else {
                    rhj = akut.a(adue, false);
                }
                Intent intent2 = new Intent();
                rhj.a(intent2);
                rhj.c();
                try {
                    akva.a(this, intent2, pendingIntent);
                } catch (PendingIntent.CanceledException e) {
                    if (Log.isLoggable("Places", 5)) {
                        String valueOf = String.valueOf(e.getMessage());
                        Log.w("Places", valueOf.length() == 0 ? new String("CanceledException when sending intent: ") : "CanceledException when sending intent: ".concat(valueOf));
                    }
                    akxf.a(this, "com.google.android.gms", stringExtra).a(pendingIntent);
                }
            } else if (Log.isLoggable("Places", 5)) {
                Log.w("Places", "Received intent has no PendingIntent to use - ignoring it");
            }
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Received intent has no event to use - ignoring it");
        }
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.places.service.ACTION_SEMANTIC_LOCATION_EVENT".equals(intent.getAction())) {
            a(intent);
        } else if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("Places", valueOf.length() == 0 ? new String("Unable to handle intent with action ") : "Unable to handle intent with action ".concat(valueOf));
        }
    }

    public TransformSemanticLocationEventIntentOperation(akxf akxf, akva akva) {
    }
}
