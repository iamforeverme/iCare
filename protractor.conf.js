// conf.js
exports.config = {
  seleniumAddress: 'http://localhost:4444/wd/hub',
  directConnect: true,
  specs: ['test/e2e/spec/spec.js']
}