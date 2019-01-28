/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class AFT_Schedule_NAD68A9002E011E9B737A09A7E865A52
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public AFT_Schedule_NAD68A9002E011E9B737A09A7E865A52(IContainer parent, String name) {
		super(parent, name, "NAD68A9002E011E9B737A09A7E865A52");
		setThinkMax(2000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of datapool reached"), 1, "End of datapool reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));
		this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(),
				new RPTStopUserEvent("Playback of Mobile or Web UI step has a fatal error"), 0,
				"Playback of Mobile or Web UI step has a fatal error"));

		this.addUserGroup(new UserGroup_1(this));

		this.addUserGroup(new UserGroup_2(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "chrome 1", "A1E922E07AF58444EBA0B16636313565");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "scenario_1", "A1E922E07AF5844FEBA0B16636313565") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Chrome_Test_A1E922C3A29BAFF0EBA0B16636313565(this,
							"A1E922E07AF5845CEBA0B16636313565") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	public class UserGroup_2 extends UserGroup {

		public UserGroup_2(IContainer parent) {
			super(parent, "chrome 2", "A1E922E07AF58469EBA0B16636313565");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_2(parent);
		}

		private Container scenario_2(IContainer parent) {
			Container scenario = new Container(parent, "scenario_2", "A1E922E07AF58474EBA0B16636313565") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Chrome2_Test_A1E922DFBF4E9380EBA0B16636313565(this,
							"A1E922E07AF58481EBA0B16636313565") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}