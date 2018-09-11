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
    assert.ok(false, 'routes/application.js should pass ESLint\n\n37:13 - Unexpected console statement. (no-console)');
  });

  QUnit.test('routes/associateweekly.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/associateweekly.js should pass ESLint\n\n');
  });

  QUnit.test('routes/batchweekly.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/batchweekly.js should pass ESLint\n\n');
  });

  QUnit.test('routes/index.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/index.js should pass ESLint\n\n');
  });

  QUnit.test('routes/main-page.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/main-page.js should pass ESLint\n\n');
  });

  QUnit.test('serializers/associateweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'serializers/associateweeklyreport.js should pass ESLint\n\n7:9 - Unexpected console statement. (no-console)\n9:9 - Unexpected console statement. (no-console)');
  });

  QUnit.test('serializers/batchweeklyreport.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'serializers/batchweeklyreport.js should pass ESLint\n\n7:9 - Unexpected console statement. (no-console)\n9:9 - Unexpected console statement. (no-console)');
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

  QUnit.test('unit/routes/index-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/index-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/main-page-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/main-page-test.js should pass ESLint\n\n');
  });
});
define('ember-project3/tests/unit/routes/index-test', ['qunit', 'ember-qunit'], function (_qunit, _emberQunit) {
  'use strict';

  (0, _qunit.module)('Unit | Route | index', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);

    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:index');
      assert.ok(route);
    });
  });
});
define('ember-project3/tests/unit/routes/main-page-test', ['qunit', 'ember-qunit'], function (_qunit, _emberQunit) {
  'use strict';

  (0, _qunit.module)('Unit | Route | main-page', function (hooks) {
    (0, _emberQunit.setupTest)(hooks);

    (0, _qunit.test)('it exists', function (assert) {
      let route = this.owner.lookup('route:main-page');
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
