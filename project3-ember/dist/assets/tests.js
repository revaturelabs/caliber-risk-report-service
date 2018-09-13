'use strict';

define('ember-project3/tests/app.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | app');

  QUnit.test('adapters/application.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'adapters/application.js should pass ESLint\n\n');
  });

  QUnit.test('adapters/associateweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'adapters/associateweeklyreport.js should pass ESLint\n\n');
  });

  QUnit.test('adapters/batchweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'adapters/batchweeklyreport.js should pass ESLint\n\n');
  });

  QUnit.test('adapters/redawr.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'adapters/redawr.js should pass ESLint\n\n');
  });

  QUnit.test('adapters/redbwr.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'adapters/redbwr.js should pass ESLint\n\n');
  });

  QUnit.test('app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'app.js should pass ESLint\n\n');
  });

  QUnit.test('components/associate-report.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/associate-report.js should pass ESLint\n\n');
  });

  QUnit.test('components/nav-bar.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/nav-bar.js should pass ESLint\n\n');
  });

  QUnit.test('components/pie-chart.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/pie-chart.js should pass ESLint\n\n');
  });

  QUnit.test('models/associateweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'models/associateweeklyreport.js should pass ESLint\n\n');
  });

  QUnit.test('models/batchweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'models/batchweeklyreport.js should pass ESLint\n\n');
  });

  QUnit.test('models/redawr.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'models/redawr.js should pass ESLint\n\n');
  });

  QUnit.test('models/redbwr.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'models/redbwr.js should pass ESLint\n\n');
  });

  QUnit.test('models/redreport.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'models/redreport.js should pass ESLint\n\n');
  });

  QUnit.test('resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'resolver.js should pass ESLint\n\n');
  });

  QUnit.test('router.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'router.js should pass ESLint\n\n11:40 - Use snake case in dynamic segments of routes (ember/routes-segments-snake-case)');
  });

  QUnit.test('routes/application.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/application.js should pass ESLint\n\n');
  });

  QUnit.test('routes/associaterecent.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/associaterecent.js should pass ESLint\n\n');
  });

  QUnit.test('routes/associateweekly.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/associateweekly.js should pass ESLint\n\n');
  });

  QUnit.test('routes/batchrecent.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/batchrecent.js should pass ESLint\n\n');
  });

  QUnit.test('routes/batchweekly.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'routes/batchweekly.js should pass ESLint\n\n15:9 - Unexpected console statement. (no-console)\n16:9 - Unexpected console statement. (no-console)');
  });

  QUnit.test('routes/redreport.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/redreport.js should pass ESLint\n\n');
  });

  QUnit.test('routes/subjectview.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/subjectview.js should pass ESLint\n\n');
  });

  QUnit.test('serializers/associateweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'serializers/associateweeklyreport.js should pass ESLint\n\n5:9 - Unexpected console statement. (no-console)\n7:13 - \'obj\' is defined but never used. (no-unused-vars)\n13:9 - Unexpected console statement. (no-console)');
  });

  QUnit.test('serializers/batchweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'serializers/batchweeklyreport.js should pass ESLint\n\n5:9 - Unexpected console statement. (no-console)\n7:13 - \'obj\' is defined but never used. (no-unused-vars)\n13:9 - Unexpected console statement. (no-console)');
  });

  QUnit.test('serializers/redawr.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'serializers/redawr.js should pass ESLint\n\n5:9 - Unexpected console statement. (no-console)\n7:13 - \'obj\' is defined but never used. (no-unused-vars)\n13:9 - Unexpected console statement. (no-console)');
  });

  QUnit.test('serializers/redbwr.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'serializers/redbwr.js should pass ESLint\n\n5:9 - Unexpected console statement. (no-console)\n7:13 - \'obj\' is defined but never used. (no-unused-vars)\n13:9 - Unexpected console statement. (no-console)');
  });
});
define('ember-project3/tests/integration/components/associate-report-test', ['qunit', 'ember-qunit', '@ember/test-helpers'], function (_qunit, _emberQunit, _testHelpers) {
  'use strict';

  (0, _qunit.module)('Integration | Component | associate-report', function (hooks) {
    (0, _emberQunit.setupRenderingTest)(hooks);

    (0, _qunit.test)('it renders', async function (assert) {
      // Set any properties with this.set('myProperty', 'value');
      // Handle any actions with this.set('myAction', function(val) { ... });

      await (0, _testHelpers.render)(Ember.HTMLBars.template({
        "id": "nSNg/rKT",
        "block": "{\"symbols\":[],\"statements\":[[1,[21,\"associate-report\"],false]],\"hasEval\":false}",
        "meta": {}
      }));

      assert.equal(this.element.textContent.trim(), '');

      // Template block usage:
      await (0, _testHelpers.render)(Ember.HTMLBars.template({
        "id": "QFDmCaub",
        "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"associate-report\",null,null,{\"statements\":[[0,\"        template block text\\n\"]],\"parameters\":[]},null],[0,\"    \"]],\"hasEval\":false}",
        "meta": {}
      }));

      assert.equal(this.element.textContent.trim(), 'template block text');
    });
  });
});
define('ember-project3/tests/integration/components/nav-bar-test', ['qunit', 'ember-qunit', '@ember/test-helpers'], function (_qunit, _emberQunit, _testHelpers) {
  'use strict';

  (0, _qunit.module)('Integration | Component | nav-bar', function (hooks) {
    (0, _emberQunit.setupRenderingTest)(hooks);

    (0, _qunit.test)('it renders', async function (assert) {
      // Set any properties with this.set('myProperty', 'value');
      // Handle any actions with this.set('myAction', function(val) { ... });

      await (0, _testHelpers.render)(Ember.HTMLBars.template({
        "id": "1eDpu8Iw",
        "block": "{\"symbols\":[],\"statements\":[[1,[21,\"nav-bar\"],false]],\"hasEval\":false}",
        "meta": {}
      }));

      assert.equal(this.element.textContent.trim(), '');

      // Template block usage:
      await (0, _testHelpers.render)(Ember.HTMLBars.template({
        "id": "uS8bFgbD",
        "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"nav-bar\",null,null,{\"statements\":[[0,\"        template block text\\n\"]],\"parameters\":[]},null],[0,\"    \"]],\"hasEval\":false}",
        "meta": {}
      }));

      assert.equal(this.element.textContent.trim(), 'template block text');
    });
  });
});
define('ember-project3/tests/integration/components/pie-chart-test', ['qunit', 'ember-qunit', '@ember/test-helpers'], function (_qunit, _emberQunit, _testHelpers) {
  'use strict';

  (0, _qunit.module)('Integration | Component | pie-chart', function (hooks) {
    (0, _emberQunit.setupRenderingTest)(hooks);

    (0, _qunit.test)('it renders', async function (assert) {
      // Set any properties with this.set('myProperty', 'value');
      // Handle any actions with this.set('myAction', function(val) { ... });

      await (0, _testHelpers.render)(Ember.HTMLBars.template({
        "id": "+HhJYT5P",
        "block": "{\"symbols\":[],\"statements\":[[1,[21,\"pie-chart\"],false]],\"hasEval\":false}",
        "meta": {}
      }));

      assert.equal(this.element.textContent.trim(), '');

      // Template block usage:
      await (0, _testHelpers.render)(Ember.HTMLBars.template({
        "id": "dvKntmSt",
        "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"pie-chart\",null,null,{\"statements\":[[0,\"        template block text\\n\"]],\"parameters\":[]},null],[0,\"    \"]],\"hasEval\":false}",
        "meta": {}
      }));

      assert.equal(this.element.textContent.trim(), 'template block text');
    });
  });
});
define('ember-project3/tests/test-helper', ['ember-project3/app', 'ember-project3/config/environment', '@ember/test-helpers', 'ember-qunit'], function (_app, _environment, _testHelpers, _emberQunit) {
  'use strict';

  (0, _testHelpers.setApplication)(_app.default.create(_environment.default.APP));

  (0, _emberQunit.start)();
});
define('ember-project3/tests/tests.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | tests');

  QUnit.test('integration/components/associate-report-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/associate-report-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/nav-bar-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/nav-bar-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/pie-chart-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/pie-chart-test.js should pass ESLint\n\n');
  });

  QUnit.test('test-helper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'test-helper.js should pass ESLint\n\n');
  });

  QUnit.test('unit/models/redreport-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/models/redreport-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/associaterecent-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/associaterecent-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/batchrecent-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/batchrecent-test.js should pass ESLint\n\n');
  });
});
define('ember-project3/tests/unit/models/redreport-test', ['qunit', 'ember-qunit'], function (_qunit, _emberQunit) {
  'use strict';

  (0, _qunit.module)('Unit | Model | redreport', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);

    // Replace this with your real tests.
    (0, _qunit.test)('it exists', function (assert) {
      let store = this.owner.lookup('service:store');
      let model = store.createRecord('redreport', {});
      assert.ok(model);
    });
  });
});
define('ember-project3/tests/unit/routes/associaterecent-test', ['qunit', 'ember-qunit'], function (_qunit, _emberQunit) {
  'use strict';

  (0, _qunit.module)('Unit | Route | associaterecent', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);

    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:associaterecent');
      assert.ok(route);
    });
  });
});
define('ember-project3/tests/unit/routes/batchrecent-test', ['qunit', 'ember-qunit'], function (_qunit, _emberQunit) {
  'use strict';

  (0, _qunit.module)('Unit | Route | batchrecent', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);

    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:batchrecent');
      assert.ok(route);
    });
  });
});
define('ember-project3/config/environment', [], function() {
  var prefix = 'ember-project3';
try {
  var metaName = prefix + '/config/environment';
  var rawConfig = document.querySelector('meta[name="' + metaName + '"]').getAttribute('content');
  var config = JSON.parse(unescape(rawConfig));

  var exports = { 'default': config };

  Object.defineProperty(exports, '__esModule', { value: true });

  return exports;
}
catch(err) {
  throw new Error('Could not read config from meta tag with name "' + metaName + '".');
}

});

require('ember-project3/tests/test-helper');
EmberENV.TESTS_FILE_LOADED = true;
//# sourceMappingURL=tests.map
