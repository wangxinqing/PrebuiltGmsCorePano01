package defpackage;

import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: cua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cua extends ec {
    public final /* synthetic */ RepositoryDatabase_Impl a;

    public cua(RepositoryDatabase_Impl repositoryDatabase_Impl) {
        this.a = repositoryDatabase_Impl;
    }

    public final void a(di diVar) {
        diVar.b("CREATE TABLE IF NOT EXISTS `resource_info` (`accountName` TEXT NOT NULL, `language` TEXT NOT NULL, `resourceKey` BLOB NOT NULL, `darkModeEnabled` INTEGER NOT NULL, `callingAndroidApp` TEXT NOT NULL, `resource` BLOB, `lastUpdatedMs` INTEGER, PRIMARY KEY(`accountName`, `language`, `resourceKey`, `darkModeEnabled`, `callingAndroidApp`))");
        diVar.b("CREATE TABLE IF NOT EXISTS `dismissed_prompt_item` (`accountName` TEXT NOT NULL, `promptItemId` INTEGER NOT NULL, PRIMARY KEY(`accountName`, `promptItemId`))");
        diVar.b("CREATE TABLE IF NOT EXISTS `per_device_dismissed_onboarding_flow` (`dismissalId` INTEGER NOT NULL, PRIMARY KEY(`dismissalId`))");
        diVar.b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        diVar.b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '670f3d20202cb8e1b2a07d18cf889162')");
    }

    public final ed b(di diVar) {
        di diVar2 = diVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("accountName", new em("accountName", "TEXT", true, 1, (String) null, 1));
        hashMap.put("language", new em("language", "TEXT", true, 2, (String) null, 1));
        hashMap.put("resourceKey", new em("resourceKey", "BLOB", true, 3, (String) null, 1));
        hashMap.put("darkModeEnabled", new em("darkModeEnabled", "INTEGER", true, 4, (String) null, 1));
        hashMap.put("callingAndroidApp", new em("callingAndroidApp", "TEXT", true, 5, (String) null, 1));
        hashMap.put("resource", new em("resource", "BLOB", false, 0, (String) null, 1));
        hashMap.put("lastUpdatedMs", new em("lastUpdatedMs", "INTEGER", false, 0, (String) null, 1));
        eq eqVar = new eq("resource_info", hashMap, new HashSet(0), new HashSet(0));
        eq a2 = eq.a(diVar2, "resource_info");
        if (!eqVar.equals(a2)) {
            String valueOf = String.valueOf(eqVar);
            String valueOf2 = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
            sb.append("resource_info(com.google.android.gms.accountsettings.mg.poc.model.repository.ResourceInfoEntity).\n Expected:\n");
            sb.append(valueOf);
            sb.append("\n Found:\n");
            sb.append(valueOf2);
            return new ed(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("accountName", new em("accountName", "TEXT", true, 1, (String) null, 1));
        hashMap2.put("promptItemId", new em("promptItemId", "INTEGER", true, 2, (String) null, 1));
        eq eqVar2 = new eq("dismissed_prompt_item", hashMap2, new HashSet(0), new HashSet(0));
        eq a3 = eq.a(diVar2, "dismissed_prompt_item");
        if (!eqVar2.equals(a3)) {
            String valueOf3 = String.valueOf(eqVar2);
            String valueOf4 = String.valueOf(a3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 133 + String.valueOf(valueOf4).length());
            sb2.append("dismissed_prompt_item(com.google.android.gms.accountsettings.mg.poc.model.repository.DismissedPromptItemEntity).\n Expected:\n");
            sb2.append(valueOf3);
            sb2.append("\n Found:\n");
            sb2.append(valueOf4);
            return new ed(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(1);
        hashMap3.put("dismissalId", new em("dismissalId", "INTEGER", true, 1, (String) null, 1));
        eq eqVar3 = new eq("per_device_dismissed_onboarding_flow", hashMap3, new HashSet(0), new HashSet(0));
        eq a4 = eq.a(diVar2, "per_device_dismissed_onboarding_flow");
        if (eqVar3.equals(a4)) {
            return new ed(true, (String) null);
        }
        String valueOf5 = String.valueOf(eqVar3);
        String valueOf6 = String.valueOf(a4);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 161 + String.valueOf(valueOf6).length());
        sb3.append("per_device_dismissed_onboarding_flow(com.google.android.gms.accountsettings.mg.poc.model.repository.PerDeviceDismissedOnboardingFlowEntity).\n Expected:\n");
        sb3.append(valueOf5);
        sb3.append("\n Found:\n");
        sb3.append(valueOf6);
        return new ed(false, sb3.toString());
    }
}
