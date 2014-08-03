def target = System.properties['env.target']
def ant = new AntBuilder()

ant.echo("Target Enviroment: ${target}")

switch(target) {
		case 'test':
			ant.echo('test')
			// Ant tasks for Test env
			break
		case 'prod':
			ant.echo('prod')
			// Ant tasks for Prod env
			break
		default:
			ant.echo('target missing: -Denv.target=test|prod')
}
